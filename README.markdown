This project provides a serializer and raw comparator for using Thrift objects in Hadoop jobs. It works seamlessly with Cascading and Cascalog.

To make use of this serializer, simply add "backtype.hadoop.ThriftSerialization" to the list of serializers listed under "io.serializations" in your JobConf. Then you can use Thrift objects directly in your tuples.