package androidx.core.view.accessibility;

import android.view.accessibility.AccessibilityRecord;

/* compiled from: MyApplication */
public abstract class w {

    /* compiled from: MyApplication */
    static class a {
        static int a(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollX();
        }

        static int b(AccessibilityRecord accessibilityRecord) {
            return accessibilityRecord.getMaxScrollY();
        }

        static void c(AccessibilityRecord accessibilityRecord, int i7) {
            accessibilityRecord.setMaxScrollX(i7);
        }

        static void d(AccessibilityRecord accessibilityRecord, int i7) {
            accessibilityRecord.setMaxScrollY(i7);
        }
    }

    public static void a(AccessibilityRecord accessibilityRecord, int i7) {
        a.c(accessibilityRecord, i7);
    }

    public static void b(AccessibilityRecord accessibilityRecord, int i7) {
        a.d(accessibilityRecord, i7);
    }
}
