package com.company;
interface Music {
    void search_song();
    void playsong();
    void stopsong();
}
interface Bluttooth{
    void turn_on_bluetooth();
    void search_device();
    void connect_devicce();
    void disconnect_device();
    void turn_off_blutooth();
}

class calling{

}

class phone {
    public void dail(){
        System.out.println("Dailing");
    }
    public void pickup(){
        System.out.println("picking up call");
    }
    class Smartphone extends phone implements Bluttooth,Music{
        public void playsong (){
            System.out.println("playing song");
        }
        public void search_song (){
            System.out.println("searrching a song");
        }
        public void stopsong(){
            System.out.println("song stopped");
        }
        public void turn_on_bluetooth(){
            System.out.println("turmi=ning on bluetooth");
        }
        public void search_device(){
            System.out.println("searching device for connection");
        }
        public void connect_devicce(){
            System.out.println("connecting device");
        }
        public void disconnect_device(){
            System.out.println("disconnecting Devide");
        }
        public void turn_off_blutooth(){
            System.out.println("turning off bluetooth");
        }

    }
}


public class interface1 {

    public static void main(String[] args) {
       // phone.Smartphone obj = new Smathphone();
    }

}
