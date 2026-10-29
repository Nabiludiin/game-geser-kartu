package w0;

import android.database.AbstractWindowedCursor;
import android.database.Cursor;
import android.os.CancellationSignal;
import androidx.room.h;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;

/* compiled from: MyApplication */
public abstract class c {
    public static void a(x0.b bVar) {
        int i7;
        ArrayList arrayList = new ArrayList();
        Cursor i02 = bVar.i0("SELECT name FROM sqlite_master WHERE type = 'trigger'");
        while (true) {
            try {
                i7 = 0;
                if (!i02.moveToNext()) {
                    break;
                } else {
                    arrayList.add(i02.getString(0));
                }
            } catch (Throwable th) {
                i02.close();
                throw th;
            }
        }
        i02.close();
        int size = arrayList.size();
        while (i7 < size) {
            Object obj = arrayList.get(i7);
            i7++;
            String str = (String) obj;
            if (str.startsWith("room_fts_content_sync_")) {
                bVar.D("DROP TRIGGER IF EXISTS " + str);
            }
        }
    }

    public static Cursor b(h hVar, x0.e eVar, boolean z7, CancellationSignal cancellationSignal) {
        Cursor q7 = hVar.q(eVar, cancellationSignal);
        if (!z7 || !(q7 instanceof AbstractWindowedCursor)) {
            return q7;
        }
        AbstractWindowedCursor abstractWindowedCursor = (AbstractWindowedCursor) q7;
        int count = abstractWindowedCursor.getCount();
        return (abstractWindowedCursor.hasWindow() ? abstractWindowedCursor.getWindow().getNumRows() : count) < count ? b.a(abstractWindowedCursor) : q7;
    }

    public static int c(File file) {
        Throwable th;
        ByteBuffer allocate;
        FileChannel channel;
        FileChannel fileChannel = null;
        try {
            allocate = ByteBuffer.allocate(4);
            channel = new FileInputStream(file).getChannel();
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            channel.tryLock(60L, 4L, true);
            channel.position(60L);
            if (channel.read(allocate) != 4) {
                throw new IOException("Bad database header, unable to read 4 bytes at offset 60");
            }
            allocate.rewind();
            int i7 = allocate.getInt();
            channel.close();
            return i7;
        } catch (Throwable th3) {
            th = th3;
            fileChannel = channel;
            if (fileChannel == null) {
                throw th;
            }
            fileChannel.close();
            throw th;
        }
    }
}
