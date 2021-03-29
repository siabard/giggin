(ns giggin.components
  (:require [reagent.core :as r]
            [giggin.state :as state]))


(defn header []
  [:div
   "header3"])


(defn gigs []
  [:div {:class "flex flex-row flex-wrap p-4 m-4"}
   (map (fn [[k v]] [:div {:class "box-border h-32 w-32 p-4 border-4 m-4"}
                   (:title v)])
        @state/giggins)])

(defn orders []
  [:div
   "orders"])

(defn footer []
  [:div
   "footer"])
