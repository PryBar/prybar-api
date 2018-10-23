package net.stickycode.prybar.discovery;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PrybarComponentWiring
    implements Iterable<PrybarComponentDependency> {

  private List<PrybarComponentDependency> dependencies = new ArrayList<>();

  @Override
  public Iterator<PrybarComponentDependency> iterator() {
    return dependencies.iterator();
  }

}
