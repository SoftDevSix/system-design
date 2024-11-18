package org.coverage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

class FirstPassInfo {
  // need a method : # of statements map
  class MethodsInfo {
    private final String methodName;
    private final String desc;

    public MethodsInfo(String methodName, String desc) {
      this.methodName = methodName;
      this.desc = desc;
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) return true;
      if (o == null || getClass() != o.getClass()) return false;

      MethodsInfo that = (MethodsInfo) o;

      if (!methodName.equals(that.methodName)) return false;
      return desc.equals(that.desc);
    }

    @Override
    public int hashCode() {
      int result = methodName.hashCode();
      result = 31 * result + desc.hashCode();
      return result;
    }

    @Override
    public String toString() {
      return methodName + " " + desc;
    }
  }

  // for each method in class, we have a set to store line number in the set.
  final Map<MethodsInfo, SortedSet<Integer>> map;
  private final String className;

  public FirstPassInfo(String cName) {
    this.map = new HashMap<>();
    this.className = cName;
  }

  public void saveMethodInfo(String methodName, String methodDesc, int line) {
    MethodsInfo mi = new MethodsInfo(methodName, methodDesc);
    if (map.containsKey(mi)) {
      SortedSet<Integer> temp = map.get(mi);
      temp.add(line);
    } else {
      SortedSet<Integer> temp = new TreeSet<>();
      temp.add(line);
      map.put(mi, temp);
    }
  }

  @Override
  public String toString() {
    Iterator<Map.Entry<MethodsInfo, SortedSet<Integer>>> itr = map.entrySet().iterator();
    StringBuilder sb0 = new StringBuilder();
    sb0.append(className + System.getProperty("line.separator"));

    while (itr.hasNext()) {
      Map.Entry<MethodsInfo, SortedSet<Integer>> temp = itr.next();
      StringBuilder sb = new StringBuilder(temp.getKey() + " : ");
      Iterator<Integer> itr2 = temp.getValue().iterator();
      while (itr2.hasNext()) {
        sb.append(itr2.next() + " ");
      }
      sb0.append(sb + System.getProperty("line.separator"));
    }
    return sb0.toString();
  }
}
