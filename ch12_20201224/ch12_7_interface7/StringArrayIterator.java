/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ch12_20201224.ch12_7_interface7;

/**
 *
 * @author xvpow
 */
public interface StringArrayIterator {
    String[] getIteratorValue();
    default void foreach(StringPrintStyleIF ps){
	String[] array =  getIteratorValue();	
	for (String value : array){
	    ps.print(value);
	}
    }
    
}
