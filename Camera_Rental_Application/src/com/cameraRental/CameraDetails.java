package com.cameraRental;

import java.util.ArrayList;
import java.util.HashMap;

public class CameraDetails {
    private ArrayList<Camera> cam = new ArrayList<>();
    private HashMap<Camera, Boolean> rentStatus = new HashMap<>();

    // Add new camera
    public void addCameraList(Camera camera) {
        cam.add(camera);
        rentStatus.put(camera, false); // By default, set the camera as not rented
    }

    public ArrayList<Camera> getCamera() {
        return cam;
    }

    public void markRented(Camera camera) {
        rentStatus.put(camera, true);
    }

    public void markAvailable(Camera camera) {
        rentStatus.put(camera, false);
    }

    public boolean isRented(Camera camera) {
        Boolean status = rentStatus.get(camera);
        return status != null && status;
    }

    public void removeCamList(int cameraId) {
        if (cameraId >= 1 && cameraId <= cam.size()) {
            Camera removed = cam.remove(cameraId - 1);
            rentStatus.remove(removed);
        }
    }
}
