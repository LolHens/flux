package org.lolhens.flux.impl

import org.lolhens.flux.Flow
import org.reactivestreams.{Subscriber, Subscription}

case class ConnectedFlows[A, B, C](a: Flow[A, B], b: Flow[B, C]) extends Flow[A, C] {
  // Subscriber
  override def onError(t: Throwable): Unit = a.onError(t)
  override def onComplete(): Unit = a.onComplete()
  override def onNext(t: A): Unit = a.onNext(t)
  override def onSubscribe(s: Subscription): Unit = a.onSubscribe(s)

  // Publisher
  override def subscribe(s: Subscriber[_ >: C]): Unit = b.subscribe(s)
}
