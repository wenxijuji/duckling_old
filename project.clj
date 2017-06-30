(defproject juji/duckling "0.4.24"
  :description "Date & Number parser"
  :license {:url "https://github.com/wenxijuji/duckling_old"
            :comments "see LICENSE"}
  :url "https://github.com/wenxijuji/duckling_old"
  :plugins [[s3-wagon-private "1.1.2"]
            [lein-midje "3.1.3"]]
  :repl-options {:init-ns duckling.core}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [org.clojure/tools.nrepl "0.2.3"]
                 [org.clojure/tools.logging "0.2.6"]
                 [clj-time "0.8.0"]
                 [prismatic/plumbing "0.5.3"]]
  :deploy-repositories [["releases" {:sign-releases false :url "https://clojars.org/repo"}]
                        ["snapshots" {:sign-releases false :url "https://clojars.org/repo"}]]
  :profiles {:dev {:dependencies [[org.clojure/tools.trace "0.7.6"]
                                  [midje "1.6.3"]
                                  [cheshire "5.3.1"]]}
             :uberjar {:aot [duckling.core]}}
  :test-selectors {:default (complement :benchmark)
                   :benchmark :benchmark})
