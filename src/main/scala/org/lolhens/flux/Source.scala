package org.lolhens.flux

import org.reactivestreams.Publisher

trait Source[B] extends Publisher[B] {
  def ~>[C](flow: Flow[B, C]): Source[C]

  def ~>[C](function: B => C): Source[C]

  def ++[C <: B](source: Source[C]): Source[C]

  def ignore: Unit
}

object Source {
  def apply[B](elems: B*): Source[B] = ???
}
