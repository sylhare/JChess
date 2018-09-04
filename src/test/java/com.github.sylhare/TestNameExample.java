package com.github.sylhare;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;


public class TestNameExample {

  @Rule
  public final TestName testName = new TestName();


  @Rule
  public TestRule watcher = new TestWatcher() {
    protected void starting(Description description) {
      System.out.println("TEST - " + description.getClassName() + " : " + description.getMethodName());
    }
  };

  @Before
  public void setup() throws Exception {
    System.out.println("Setup for test '" + testName.getMethodName() + "'");
  }

  @Test
  public void createTest() {
  }

  @Test
  public void retrieveTest() {
  }

  @Test
  public void updateTest() {
  }

  @Test
  public void deleteTest() {
  }
}