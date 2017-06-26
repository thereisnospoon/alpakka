package akka.stream.alpakka.googlecloud.storage

import akka.http.scaladsl.model.{HttpMethod, HttpMethods, HttpRequest}
import org.scalatest.FlatSpec

class GoogleCloudStorageSpec extends FlatSpec {

  behavior of "Google Cloud Storage streams"

  it should "successfully pass" in {
    HttpRequest(method = HttpMethods.POST, )
  }
}
