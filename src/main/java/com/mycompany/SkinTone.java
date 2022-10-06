package com.mycompany;


public enum SkinTone {

  FAIR, LIGHT, MEDIUM , DARK;

  @Override
  public String toString() {
    return name().toLowerCase();
  }
}
