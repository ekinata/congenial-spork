/*
 * Scala (https://www.scala-lang.org)
 *
 * Copyright EPFL and Lightbend, Inc.
 *
 * Licensed under Apache License 2.0
 * (http://www.apache.org/licenses/LICENSE-2.0).
 *
 * See the NOTICE file distributed with this work for
 * additional information regarding copyright ownership.
 */

package scala.runtime.java8

@FunctionalInterface trait JFunction1$mcVD$sp extends Function1[Any, Any] with Serializable {
  def apply$mcVD$sp(v1: Double): Unit
  override def apply(t: Any): Any = {
    apply$mcVD$sp(scala.runtime.BoxesRunTime.unboxToDouble(t))
    scala.runtime.BoxedUnit.UNIT
  }
}
