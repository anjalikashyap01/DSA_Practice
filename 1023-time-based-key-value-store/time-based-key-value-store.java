class TimeMap {
    Map<String ,List<Pair>> timeMap;
    public TimeMap() {
    timeMap=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
       if(!timeMap.containsKey(key))
       {
        timeMap.put(key,new ArrayList<>());
       }
     timeMap.get(key).add(new Pair(timestamp,value));
    }
    
    public String get(String key, int timestamp) {
        if(!timeMap.containsKey(key))
        {
            return "";
        }
        List<Pair> list=timeMap.get(key);
     int start=0;
     int end=list.size()-1;
     String ans="";
     while(start<=end)
     {
        int mid=start+(end-start)/2;
     if(list.get(mid).timestamp==timestamp)
     {
        return list.get(mid).value;
     }
    else if(list.get(mid).timestamp<timestamp)
    {
        ans=list.get(mid).value;
        start=mid+1;
    }
    else
    {
        end=mid-1;
    }
}
     return ans;
    }
    class Pair{
        int timestamp;
        String value;
        Pair(int timestamp,String value)
        {
            this.timestamp=timestamp;
            this.value=value;
        }
    }
}

/**
 * Your TimeMap object will be instantiated and called as such:
 * TimeMap obj = new TimeMap();
 * obj.set(key,value,timestamp);
 * String param_2 = obj.get(key,timestamp);
 */