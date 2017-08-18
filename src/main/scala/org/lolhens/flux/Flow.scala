package org.lolhens.flux

import org.reactivestreams.{Processor, Subscriber, Subscription}

trait Flow[-A, +B] extends Source[B] with Processor[A, B] {
  def ~>[C](flow: Flow[B, C]): Flow[A, C] = impl.ConnectedFlows(this, flow)

  def ~>[C](function: B => C): Flow[A, C] = map(function)

  def map[C](function: B => C): Flow[A, C] = ???
}

object Flow {
  def apply[A]: Flow[A, A] = new Flow[A, A] {
    override def ~>[C](flow: Flow[A, C]): Flow[A, C] = ???
    override def ~>[C](function: (A) => C): Flow[A, C] = ???

    // Subscriber
    override def onError(t: Throwable): Unit = ???
    override def onComplete(): Unit = ???
    override def onNext(t: A): Unit = ???
    override def onSubscribe(s: Subscription): Unit = ???
    override def ++[C <: A](source: Source[C]): Source[C] = ???
    override def ignore: Unit = ???

    // Publisher
    override def subscribe(s: Subscriber[_ >: A]): Unit = ???
  }
}
