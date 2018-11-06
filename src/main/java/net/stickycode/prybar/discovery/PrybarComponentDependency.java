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

  public PrybarComponentDependency withTarget(Class<?> target) {
    this.target = target;
    return this;
  }

  public PrybarComponentDependency withFieldName(String value) {
    this.fieldName = value;
    return this;
  }

  public PrybarComponentDependency withFieldType(String value) {
    this.fieldType = value;
    return this;
  }

}
