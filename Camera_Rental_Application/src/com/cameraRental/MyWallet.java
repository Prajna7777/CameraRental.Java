package com.cameraRental; // Ensure that both classes are in the same package

public class MyWallet {
    private CameraDetails cameradetail = new CameraDetails();
    private double balance = 100.0d;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance += balance;
    }

    public boolean canRent(Camera camera) {
        return balance >= camera.getPrice();
    }

    public boolean rent(Camera camera) {
        if (balance >= camera.getPrice() && !cameradetail.isRented(camera)) {
            balance -= camera.getPrice();
            cameradetail.markRented(camera);
            return true;
        }
        return false;
    }

    // Additional method to check wallet balance
    public boolean checkBalance(double amount) {
        return balance >= amount;
    }

    public static void main(String[] args) {
        MyWallet wallet = new MyWallet();
        CameraDetails cameraDetails = new CameraDetails();

        // Adding cameras to the system
        cameraDetails.addCameraList(new Camera("Canon", "EOS 5D Mark IV", 500));
        cameraDetails.addCameraList(new Camera("Nikon", "D850", 600));
        cameraDetails.addCameraList(new Camera("Sony", "A7 III", 700));

        // Display wallet balance
        System.out.println("Initial Wallet Balance: " + wallet.getBalance());

        // Rent a camera
        Camera cameraToRent = cameraDetails.getCamera().get(0); // Assuming the first camera in the list
        if (wallet.canRent(cameraToRent)) {
            wallet.rent(cameraToRent);
            System.out.println("Camera rented successfully. Updated Wallet Balance: " + wallet.getBalance());
        } else {
            System.out.println("Insufficient balance or camera is already rented.");
        }
    }
}
