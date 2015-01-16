package com.repeatedstrings.StupidStringParsing;

import java.util.Map;
import java.util.Set;

import com.google.common.base.Splitter;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	String stupidString = "thisStringis,stupid;soIsThis,one"; 
		Map<String, String> whyDidntIdoThis = Splitter.on(";").withKeyValueSeparator(",").split(stupidString);
        Set<String> stringList = whyDidntIdoThis.keySet();
        for(String  dumbKey: stringList){
        	System.out.println("the dumb key is :"+dumbKey);
        	System.out.println("the map value : "+whyDidntIdoThis.get(dumbKey));
        }
        
    }
}
