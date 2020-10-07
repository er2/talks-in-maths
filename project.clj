(defproject talks-in-maths "0.1.0-SNAPSHOT"
  :description "Looks up word lengths in OEIS"
  :url "http://github.com/er2/talks-in-maths"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [compojure "1.6.2"]
                 [hiccup "1.0.5"]
                 [ring "1.8.2"]]
  :plugins [[lein-ring "0.12.5"]]
  :repl-options {:init-ns talks-in-maths.core}
  :ring {:handler talks-in-maths.core/app})
