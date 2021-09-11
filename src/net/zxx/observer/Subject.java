package net.zxx.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 主题有很多个观察者对象
 */
public class Subject {
    private List<Observer> observerList = new ArrayList<>();

    /**
     * 新增观察者
     * @param observer
     */
    public void addObserver(Observer observer){
        this.observerList.add(observer);
    }


    /**
     *删除观察者
     * @param observer
     */
    public void deleteObserver(Observer observer){
        this.observerList.remove(observer);
    }


    public void notifyAllObserver(){
        for(Observer observer:this.observerList){
            observer.update();
        }
    }
}
