package castle;

import java.util.HashMap;

public class Room {
    private String description;
    private HashMap<String,Room> exits=new HashMap<String,Room>();
   

    public Room(String description) 
    {
        this.description = description;
    }
    
    public void setExit(String dir,Room room) {
    	exits.put(dir,room);
    }


    @Override
    public String toString()
    {
        return description;
    }
    
    public String getExitDesc() {
    	StringBuffer sb=new StringBuffer();//采用很多复杂的字符串去产生一个字符串用StringBuffer
    	for(String dir:exits.keySet()) {
    		sb.append(dir);
    		sb.append(' ');
    	}
    	
    	return sb.toString();
    }
    
    public Room getExit(String direction) {//分装，保持恰当的接口
//    	Room ret=null;
//    	ret=exits.get(direction);//替代下面这几行
//    	if(direction.equals("north")) {
//            ret = northExit;
//        }
//        if(direction.equals("east")) {
//            ret = eastExit;
//        }
//        if(direction.equals("south")) {
//            ret = southExit;
//        }
//        if(direction.equals("west")) {
//            ret = westExit;
//        }
    	return exits.get(direction);
    }
}
