/*
 * SPDX-FileCopyrightText: 2026 The LineageOS Project
 * SPDX-License-Identifier: Apache-2.0
 */

package org.lineageos.blackberry.wallpapers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

/**
 * Marker receiver: its intent filter lets WallpaperPicker2 discover this
 * package's wallpaper resources. No broadcast needs handling.
 */
public class PartnerReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
    }
}
