package com.nklkarthi.service;

import com.nklkarthi.doman.NotificationData;

public interface NotificationService {

    void initiateNotification(NotificationData notificationData) throws InterruptedException;

}
