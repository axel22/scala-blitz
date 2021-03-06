package org.scala.optimized.test.par
package scalameter


import org.scalameter.api._



class benchmarks extends PerformanceTest.Regression with Serializable {

  /* config */

  def persistor = new SerializationPersistor

  /* tests */

  include[ConcBench]
  include[ConcMemory]
  include[ParRangeBench]
  include[ParConcBench]
  include[ParArrayBench]
  include[ParHashMapBench]
  include[ReducableBench]
  include[ParHashTrieSetBench]
}





