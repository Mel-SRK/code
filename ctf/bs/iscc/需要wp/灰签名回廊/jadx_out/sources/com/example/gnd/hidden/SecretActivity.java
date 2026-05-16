package com.example.gnd.hidden;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;
import defpackage.az0;
import defpackage.f00;
import defpackage.ft0;
import defpackage.kc;
import defpackage.mb;
import defpackage.sn0;
import defpackage.wc;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class SecretActivity extends Activity {
    @Override // android.app.Activity
    public final void onCreate(Bundle bundle) {
        String str;
        String string;
        Uri data;
        super.onCreate(bundle);
        Intent intent = getIntent();
        sn0 sn0Var = sn0.f;
        if (intent != null && (data = intent.getData()) != null) {
            sn0Var = (f00.h(data.getScheme(), "securevault") && f00.h(data.getHost(), "secret") && f00.h(data.getPath(), "/unlock") && f00.h(data.getQueryParameter("token"), "RC4_KEY_PART4")) ? sn0.d : sn0.e;
        }
        LinearLayout linearLayout = new LinearLayout(this);
        int i = 1;
        linearLayout.setOrientation(1);
        linearLayout.setGravity(17);
        linearLayout.setBackgroundColor(-16777216);
        TextView textView = new TextView(this);
        textView.setText("🔐 Secret Debug Panel");
        textView.setTextSize(24.0f);
        int i2 = -16711936;
        textView.setTextColor(-16711936);
        textView.setGravity(17);
        TextView textView2 = new TextView(this);
        int iOrdinal = sn0Var.ordinal();
        if (iOrdinal == 0) {
            str = "✅ Access Granted";
        } else if (iOrdinal == 1) {
            str = "⚠️ Invalid URI Parameters";
        } else {
            if (iOrdinal != 2) {
                wc.l();
                return;
            }
            str = "🚫 Direct Launch Detected";
        }
        textView2.setText(str);
        textView2.setTextSize(18.0f);
        int iOrdinal2 = sn0Var.ordinal();
        if (iOrdinal2 != 0) {
            if (iOrdinal2 == 1) {
                i2 = -256;
            } else {
                if (iOrdinal2 != 2) {
                    wc.l();
                    return;
                }
                i2 = -65536;
            }
        }
        textView2.setTextColor(i2);
        textView2.setGravity(17);
        int i3 = 0;
        textView2.setPadding(0, 32, 0, 32);
        TextView textView3 = new TextView(this);
        int iOrdinal3 = sn0Var.ordinal();
        if (iOrdinal3 == 0) {
            byte[] bArr = {73, 83, 67, 67, 50, 48, 50, 82, 86};
            String strT = f00.t(new String(new byte[]{bArr[7], bArr[8]}, mb.a));
            getSharedPreferences("key_cache", 0).edit().putString("fragment4", strT).apply();
            String str2 = "\n                |=== Fragment Unlocked ===\n                |Data: " + strT + "\n                |========================\n                ";
            if (!ft0.o("|")) {
                List listP = ft0.p(str2);
                int length = str2.length();
                listP.size();
                int size = listP.size() - 1;
                ArrayList arrayList = new ArrayList();
                Iterator it = listP.iterator();
                int i4 = 0;
                while (true) {
                    int i5 = i;
                    String strSubstring = null;
                    if (!it.hasNext()) {
                        StringBuilder sb = new StringBuilder(length);
                        kc.au(arrayList, sb, null, 124);
                        string = sb.toString();
                        break;
                    }
                    Object next = it.next();
                    int i6 = i4 + 1;
                    if (i4 < 0) {
                        f00.af();
                        throw null;
                    }
                    String str3 = (String) next;
                    if ((i4 != 0 && i4 != size) || !ft0.o(str3)) {
                        int length2 = str3.length();
                        while (true) {
                            if (i3 >= length2) {
                                i3 = -1;
                                break;
                            } else if (!az0.x(str3.charAt(i3))) {
                                break;
                            } else {
                                i3++;
                            }
                        }
                        if (i3 != -1 && str3.startsWith("|", i3)) {
                            strSubstring = str3.substring(i5 + i3);
                        }
                        if (strSubstring == null) {
                            strSubstring = str3;
                        }
                    }
                    if (strSubstring != null) {
                        arrayList.add(strSubstring);
                    }
                    i = i5;
                    i4 = i6;
                    i3 = 0;
                }
            } else {
                wc.n("marginPrefix must be non-blank string.");
                return;
            }
        } else if (iOrdinal3 == 1) {
            string = "=== Access Denied ===\nInvalid parameters\n====================";
        } else {
            if (iOrdinal3 != 2) {
                wc.l();
                return;
            }
            string = "=== Access Denied ===\nInvalid launch method\n=====================";
        }
        textView3.setText(string);
        textView3.setTextSize(14.0f);
        textView3.setTextColor(-16711681);
        textView3.setGravity(17);
        textView3.setPadding(32, 16, 32, 32);
        linearLayout.addView(textView);
        linearLayout.addView(textView2);
        linearLayout.addView(textView3);
        setContentView(linearLayout);
    }
}
