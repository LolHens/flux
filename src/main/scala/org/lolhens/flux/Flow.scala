package org.lolhens.flux

import org.reactivestreams.Processor

trait Flow[A, B] extends Source[B] with Processor[A, B] {
  def inlet: Sink[A]

  def outlet: Source[B]

  def ~>[C](flow: Flow[B, C]): Flow[A, C]

  def ~>[C](function: B => C): Flow[A, C]
}

object Flow {
  def apply[A]: Flow[A, A] = ???
}
