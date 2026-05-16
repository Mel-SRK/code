package com.example.gnd.hidden;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.util.Log;
import defpackage.f00;
import defpackage.kc;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public final class SecretReceiver extends BroadcastReceiver {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        String stringExtra;
        context.getClass();
        intent.getClass();
        if (f00.h(intent.getAction(), "com.example.gnd.SECRET_ACTION") && (stringExtra = intent.getStringExtra("code")) != null) {
            String lowerCase = stringExtra.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            switch (lowerCase.hashCode()) {
                case -1249327287:
                    if (lowerCase.equals("getkey")) {
                        SharedPreferences sharedPreferences = context.getSharedPreferences("receiver_auth", 0);
                        boolean z = sharedPreferences.getBoolean("authenticated", false);
                        long j = sharedPreferences.getLong("auth_time", 0L);
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        if (z && jCurrentTimeMillis - j <= 300000 && intent.getIntExtra("part", -1) == 3) {
                            int[] iArr = {12, 28, 11, 51};
                            ArrayList arrayList = new ArrayList(4);
                            int i = 0;
                            int i2 = 0;
                            while (i < 4) {
                                arrayList.add(Character.valueOf((char) ((i2 ^ iArr[i]) ^ 90)));
                                i++;
                                i2++;
                            }
                            context.getSharedPreferences("key_cache", 0).edit().putString("fragment3", f00.t(kc.av(arrayList, "", null, null, null, 62))).apply();
                            break;
                        }
                    }
                    break;
                case 3005864:
                    if (lowerCase.equals("auth")) {
                        String stringExtra2 = intent.getStringExtra("token");
                        if (stringExtra2 == null) {
                            Log.e("SecretReceiver", "Auth failed");
                        } else if (!stringExtra2.equals("ISCC2026")) {
                            Log.e("SecretReceiver", "Auth failed");
                        } else {
                            context.getSharedPreferences("receiver_auth", 0).edit().putBoolean("authenticated", true).putLong("auth_time", System.currentTimeMillis()).apply();
                        }
                        break;
                    }
                    break;
                case 3145580:
                    lowerCase.equals("flag");
                    break;
                case 95458899:
                    lowerCase.equals("debug");
                    break;
            }
        }
    }
}
