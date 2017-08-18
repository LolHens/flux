package org.lolhens.flux

trait SourceOps[+B] {
  self: Source[B] =>

  def concat[C >: B](sources: Source[C]*): Source[C] = impl.ConcatSource[C](this, sources)

  def ++[C >: B](source: Source[C]): Source[C] = concat(source)

  def ignore: Unit = ???
}
