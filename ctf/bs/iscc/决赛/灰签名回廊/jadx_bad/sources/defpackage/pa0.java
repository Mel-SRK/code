package defpackage;

import android.os.Bundle;
import android.os.Handler;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;

/* JADX INFO: loaded from: classes.dex */
public class pa0 implements InputConnection {
    public final l1 a;
    public oi0 b;

    public pa0(oi0 oi0Var, l1 l1Var) {
        this.a = l1Var;
        this.b = oi0Var;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean beginBatchEdit() {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.beginBatchEdit();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean clearMetaKeyStates(int i) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.clearMetaKeyStates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final void closeConnection() {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            if (oi0Var != null) {
                oi0Var.closeConnection();
                this.b = null;
            }
            this.a.g(this);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCompletion(CompletionInfo completionInfo) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.commitCompletion(completionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i, Bundle bundle) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitCorrection(CorrectionInfo correctionInfo) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.commitCorrection(correctionInfo);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean commitText(CharSequence charSequence, int i) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.commitText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingText(int i, int i2) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.deleteSurroundingText(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean deleteSurroundingTextInCodePoints(int i, int i2) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.deleteSurroundingTextInCodePoints(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean endBatchEdit() {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.b();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean finishComposingText() {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.finishComposingText();
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final int getCursorCapsMode(int i) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.getCursorCapsMode(i);
        }
        return 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public final ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.getExtractedText(extractedTextRequest, i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getSelectedText(int i) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.getSelectedText(i);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextAfterCursor(int i, int i2) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.getTextAfterCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final CharSequence getTextBeforeCursor(int i, int i2) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.getTextBeforeCursor(i, i2);
        }
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performContextMenuAction(int i) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.performContextMenuAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performEditorAction(int i) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.performEditorAction(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean performPrivateCommand(String str, Bundle bundle) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.performPrivateCommand(str, bundle);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean reportFullscreenMode(boolean z) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean requestCursorUpdates(int i) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.requestCursorUpdates(i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean sendKeyEvent(KeyEvent keyEvent) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.sendKeyEvent(keyEvent);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingRegion(int i, int i2) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.setComposingRegion(i, i2);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setComposingText(CharSequence charSequence, int i) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.setComposingText(charSequence, i);
        }
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public final boolean setSelection(int i, int i2) {
        oi0 oi0Var = this.b;
        if (oi0Var != null) {
            return oi0Var.setSelection(i, i2);
        }
        return false;
    }
}
