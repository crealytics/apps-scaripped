import scala.collection.IterableLike
import scala.collection.generic.CanBuildFrom

package object extensions {

  implicit class RichCollection[A, Repr](val xs: IterableLike[A, Repr]) extends AnyVal {
    def distinctBy[B, That](f: A => B)(implicit cbf: CanBuildFrom[Repr, A, That]) = {
      val builder = cbf(xs.repr)
      val i = xs.iterator
      var set = Set[B]()
      while (i.hasNext) {
        val o = i.next
        val b = f(o)
        if (!set(b)) {
          set += b
          builder += o
        }
      }
      builder.result
    }
  }
}
