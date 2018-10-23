package net.stickycode.prybar.discovery;

public class PrybarComponentDependency {

  private Class<?> target;

  private String fieldName;

  private String fieldType;

  public Class<?> getTarget() {
    return this.target;
  }

  public String getFieldName() {
    return this.fieldName;
  }

  public String getFieldTypeReference() {
    return "L" + fieldType + ";";
  }

  public String getFieldTypePath() {
    return fieldType;
  }

}
