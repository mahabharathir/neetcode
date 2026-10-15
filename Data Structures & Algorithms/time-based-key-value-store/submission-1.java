class TimeMap {

    static class Entry{
        int timestamp;
        String value;

        Entry(int timestamp, String value){
            this.timestamp = timestamp;
            this.value=value;
        }
    }

    private Map<String, List<Entry>> map;
    public TimeMap() {
        map = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Entry(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if (!map.containsKey(key)) {
            return "";
        }

        List<Entry> list = map.get(key);
        int low =0;
        int high = list.size()-1;
        String result ="";

        while(low <= high){
            int mid = low + (high - low)/2;

            if(list.get(mid).timestamp <= timestamp){
                result = list.get(mid).value;
                low =mid +1;
            }else{
                high = mid -1;
            }
        }
        return result;
    }
}
