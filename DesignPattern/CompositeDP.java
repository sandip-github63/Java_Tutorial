package com.test;

/* Composite Design Pattern means that collection of many object in form of tree 
 * object can have two object 1) Leaf 2) Composite 
 *  Leaf represent single object
 *  Composite represent multiple object either contain Leaf or Composite itself
 *  
 *  Real life example : To create A laptop we need Hardware and Software
 *  now Hardware is a composite here becuase it further cantain multiple Leaf
 *  ie Hardware can have CPU , Mouse , Keyword now CPU don't have further children 
 *  hence it is called Leaf so these all are represent a single object that is called 
 *  Computer 
 *  Hence we called Composite Desing Pattern 
 */

import java.util.ArrayList;
import java.util.List;

interface Component{
	void operation();
}

class Leaf implements Component{
	String name;
	
	public Leaf(String name) {
      this.name=name;		
	}

	@Override
	public void operation() {
		System.out.println("Leaf "+name);
		
	}
	
	
}


class Composite implements Component{	 
	
	 List<Component> listcomponent=new ArrayList<Component>();
	 
	 public Composite() {
		 
		 
		 
	 }
	 
	 public void addComponent(Component component) {
		 this.listcomponent.add(component);
	 } 
	 

	@Override
	public void operation() {
		for(Component component:listcomponent) {
			component.operation();
		}
		
	}
}

public class CompositeDP {
	
	public static void main(String args[]) {
		
		    Leaf leaf1 = new Leaf("Leaf 1");
	        Leaf leaf2 = new Leaf("Leaf 2");

	        Composite composite1 = new Composite();
	        composite1.addComponent(leaf1);
	        composite1.addComponent(leaf2);

	        Leaf leaf3 = new Leaf("Leaf 3");

	        Composite composite2 = new Composite();
	        composite2.addComponent(leaf3);
	        composite2.addComponent(composite1);

	        composite2.operation();
		
	}

}
