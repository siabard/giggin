(ns giggin.core
  (:require [reagent.core :as r]
            [giggin.components :refer [header gigs orders footer]])
  )


(defn app []
  [:div {:class "container md-auto"}
   [:div {:class "flex flex-col h-screen"}
    [:div {:class "flex-none h-16"}
     [header]]
    [:div {:class "flex flex-grow flex-row"}
     [:div {:class "container md-auto grid grid-cols-3 gap-4"}
      [:div {:class "col-span-2"}
       [gigs]]
      [:div {:class "col-span-1"}
       [orders]]]]
    [:div {:class "flex-none h-16"}
     [footer]]]])
    

(defn ^export main! []
  (r/render app (.getElementById js/document "root"))
  )

(defn reload! []
  (r/render app (.getElementById js/document "root"))
  )











