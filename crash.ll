;llc -filetype=obj crash.ll
;clang crash.o -o crash
@main = common global i8 0, align 4
