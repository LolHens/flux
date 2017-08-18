package org.lolhens.flux

import org.reactivestreams.Publisher

trait Source[+B] extends SourceOps[B] with Publisher[B] {
  def ~>[C](flow: Flow[B, C]): Source[C]

  def ~>[C](function: B => C): Source[C]
}

object Source {
  def apply[B](elems: B*): Source[B] = ???
}
