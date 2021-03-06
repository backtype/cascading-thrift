(defproject backtype/cascading-thrift "0.1.0"
  :java-source-path "src/jvm"
  :javac-options {:debug "true" :fork "true"}
  :repositories {
                 "conjars" "http://conjars.org/repo"
                 }
  :dependencies [
                 [cascading/cascading-core "1.2-wip-63" :exclusions [org.codehaus.janino/janino]]
                 [backtype/thriftjava "1.0.0"]
]
  :dev-dependencies [
                     [org.apache.hadoop/hadoop-core "0.20.2-dev"]
                     [swank-clojure "1.2.1"]
                    ])
