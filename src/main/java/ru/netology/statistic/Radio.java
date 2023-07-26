package ru.netology.statistic;

public class Radio {
    private int currentStation;
    private int currentVolume;

    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation > 9){
            return;
        }

        if (currentStation < 0){
            return;
        }

        this.currentStation = currentStation;
    }

   public void nex(){
        if (currentStation ==9){
            currentStation = 0;

        }else {
            currentStation++;
        }
   }
    public void prev(){
        if (currentStation ==0){
            currentStation = 9;

        }else {
            currentStation--;
        }
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume > 100) {
            return;
        }
        if (currentVolume < 0){
            return;
        }
        this.currentVolume = currentVolume;
    }

    public void increaseVolume(){
        if (currentVolume < 100){
            currentVolume++;
        }
    }
    public void decreaseVolume(){
        if (currentVolume > 0){
            currentVolume--;
        }
    }
}
