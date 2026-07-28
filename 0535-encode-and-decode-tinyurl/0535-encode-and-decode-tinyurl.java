public class Codec {
    HashMap<String,String> eMap = new HashMap<>();
    HashMap<String,String> dMap = new HashMap<>();
    int id = 1;

    // Encodes a URL to a shortened URL.
    public String encode(String longUrl) {
        if(eMap.containsKey(longUrl)) {
            return eMap.get(longUrl);
        }
        else {
            String base = "http://tinyurl.com/" + id++;
            eMap.put(longUrl,base);
            dMap.put(base,longUrl);

            return base;
        }
    }

    // Decodes a shortened URL to its original URL.
    public String decode(String shortUrl) {
        return dMap.get(shortUrl);
        
    }
}


// Your Codec object will be instantiated and called as such:
// Codec codec = new Codec();
// codec.decode(codec.encode(url));