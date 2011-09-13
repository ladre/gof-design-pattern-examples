package com.designpatterns.creational.factory.better.more;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Set;
import java.util.jar.JarEntry;
import java.util.jar.JarInputStream;

public class ClassUtil {
	
	public static Set<Class<?>> getClassesImplementing(String packageName,Class<?> clazz) throws IOException, ClassNotFoundException {
		   ClassLoader loader = Thread.currentThread().getContextClassLoader();
		   Set<Class<?>> classes = new HashSet<Class<?>>();
		   String path = packageName.replace('.', '/');
		   Enumeration<URL> resources = loader.getResources(path);
		   if (resources != null) {
		      while (resources.hasMoreElements()) {
		         String filePath = resources.nextElement().getFile();
		         // WINDOWS HACK
		         if(filePath.indexOf("%20") > 0)
		            filePath = filePath.replaceAll("%20", " ");
		         if (filePath != null) {
		            if ((filePath.indexOf("!") > 0) & (filePath.indexOf(".jar") > 0)) {
		               String jarPath = filePath.substring(0, filePath.indexOf("!"))
		                  .substring(filePath.indexOf(":") + 1);
		               // WINDOWS HACK
		               if (jarPath.indexOf(":") >= 0) jarPath = jarPath.substring(1); 
		               classes.addAll(getFromJARFile(jarPath, path,clazz));
		            } else {
		               classes.addAll(
		                  getFromDirectory(new File(filePath), packageName,clazz));
		            }
		         }
		      }
		   }
		   return classes;
		}

	public static Set<Class<?>> getFromDirectory(File directory, String packageName,Class<?> clazz) throws ClassNotFoundException {
	   Set<Class<?>> classes = new HashSet<Class<?>>();
	   if (directory.exists()) {
	      for (String file : directory.list()) {
	         if (file.endsWith(".class")) {
	            String name = packageName + '.' + stripFilenameExtension(file);
	            Class<?> c = Class.forName(name);
            	if (!c.isInterface() && isImplementingClass(c,Vehicle.class)){
            		classes.add(c);
            	}
	         }
	      }
	   }
	   return classes;
	}

	public static Set<Class<?>> getFromJARFile(String jar, String packageName,Class<?> clazz) throws FileNotFoundException, IOException, ClassNotFoundException {
	   Set<Class<?>> classes = new HashSet<Class<?>>();
	   JarInputStream jarFile = new JarInputStream(new FileInputStream(jar));
	   JarEntry jarEntry;
	   do {
	      jarEntry = jarFile.getNextJarEntry();
	      if (jarEntry != null) {
	         String className = jarEntry.getName();
	         if (className.endsWith(".class")) {
	            className = stripFilenameExtension(className);
	            if (className.startsWith(packageName)){
	            	Class<?> c = Class.forName(className.replace('/', '.'));
	            	if (!c.isInterface() && isImplementingClass(c,clazz)){
	            		classes.add(c);
	            	}
	            }
	         }
	      }
	   } while (jarEntry != null);
	   return classes;
	}

	public static Boolean isImplementingClass(Class<?> parent, Class<?> interf){
		for (Class<?> c : parent.getInterfaces()) {
			if (c.equals(interf)) {
				return true;
			}
		}
		return false;
	}

	public static String stripFilenameExtension(String fileName){
		return fileName.substring(0,fileName.indexOf('.'));
	}


}





