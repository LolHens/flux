package org.lolhens.flux.impl

import org.lolhens.flux.{Flow, Source}
import org.reactivestreams.{Subscriber, Subscription}

case class MappedFlow[A, B, C](flow: Flow[A, B], function: B => C) extends Flow[A, C] {
  override def onError(t: Throwable): Unit = ???
  override def onComplete(): Unit = ???
  override def onNext(t: A): Unit = ???
  override def onSubscribe(s: Subscription): Unit = ???
  override def ignore: Unit = ???
  override def subscribe(s: Subscriber[_ >: C]): Unit = ???
}
