package org.lolhens.flux

import org.reactivestreams.Subscriber

trait Sink[A] extends Subscriber[A] {
  //def <~[C](source: Source[B]): Source[C]

  //def <~[C](function: B => C): Source[C]
}

object Sink {

}
