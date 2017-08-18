package org.lolhens.flux.impl

import org.lolhens.flux.Source

case class ConcatSource[+B](source: Source[B], other: Seq[Source[B]]) extends Source[B] {

}
