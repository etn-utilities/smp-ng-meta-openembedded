require postgresql.inc

LIC_FILES_CHKSUM = "file://COPYRIGHT;md5=89afbb2d7716371015101c2b2cb4297a"

SRC_URI += "\
   file://not-check-libperl.patch \
   file://0001-Add-support-for-RISC-V.patch \
   file://0001-Improve-reproducibility.patch \
   file://0001-configure.ac-bypass-autoconf-2.69-version-check.patch \
   file://0001-config_info.c-not-expose-build-info.patch \
   file://0001-Properly-NULL-terminate-GSS-receive-buffer-on-error-.patch \
   file://0001-postgresql-fix-ptest-failure-of-sysviews.patch \
   file://CVE-2023-2454.patch \
   file://CVE-2023-2455.patch \
"

SRC_URI[sha256sum] = "a670bd7dce22dcad4297b261136b3b1d4a09a6f541719562aa14ca63bf2968a8"

CVE_CHECK_IGNORE += "\
   CVE-2017-8806 \
"
