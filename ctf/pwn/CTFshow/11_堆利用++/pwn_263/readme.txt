10
House Of XXX

远程环境：Glibc-2.38
Patch Libc Maybe It's Ez Or maybe it isn't ez Orz
远程flag文件名：/ctfshow_flag
Patch Libc： ''' diff --git a/libio/libioP.h b/libio/libioP.h index 745278e..b3858d1 100644 --- a/libio/libioP.h +++ b/libio/libioP.h @@ -100,7 +100,7 @@ #define _IO_JUMPS_FILE_plus(THIS)
_IO_CAST_FIELD_ACCESS ((THIS), struct _IO_FILE_plus, vtable) #define _IO_WIDE_JUMPS(THIS) \

_IO_CAST_FIELD_ACCESS ((THIS), struct _IO_FILE, _wide_data)->_wide_vtable
(IO_validate_vtable(_IO_CAST_FIELD_ACCESS ((THIS), struct _IO_FILE, _wide_data)->_wide_vtable)) #define _IO_CHECK_WIDE(THIS)
(_IO_CAST_FIELD_ACCESS ((THIS), struct _IO_FILE, _wide_data) != NULL) '''