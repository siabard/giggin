(ns giggin.state
  (:require [reagent.core :as r]))

(def giggins
  (r/atom
   {:event-01
    {:id :event-01
     :title "Event 01"
     :artist "Siabard"
     :desc "An event is made by siabard"
     :img "https://i.pravatar.cc/150?img=54"
     }
    :event-02
    {:id :event-02
     :title "Event 02"
     :artist "Siabard"
     :desc "An event is made by siabard"
     :img "https://i.pravatar.cc/150?img=54"
     }
    :event-03
    {:id :event-03
     :title "Event 03"
     :artist "Siabard"
     :desc "An event is made by siabard"
     :img "https://i.pravatar.cc/150?img=54"
     }
    :event-04
    {:id :event-04
     :title "Event 04"
     :artist "Siabard"
     :desc "An event is made by siabard"
     :img "https://i.pravatar.cc/150?img=54"
     }
    :event-05
    {:id :event-05
     :title "Event 05"
     :artist "Siabard"
     :desc "An event is made by siabard"
     :img "https://i.pravatar.cc/150?img=54"
     }
    :event-06
    {:id :event-06
     :title "Event 06"
     :artist "Siabard"
     :desc "An event is made by siabard"
     :img "https://i.pravatar.cc/150?img=54"
     }
    :event-07
    {:id :event-07
     :title "Event 07"
     :artist "Siabard"
     :desc "An event is made by siabard"
     :img "https://i.pravatar.cc/150?img=54"
     }
    }))
