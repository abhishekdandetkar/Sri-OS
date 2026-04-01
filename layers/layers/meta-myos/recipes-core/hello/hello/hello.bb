SUMMARY = "My first Yocto app"
DESCRIPTION = "Simple hello app for my TV OS"
LICENSE = "MIT"

SRC_URI = "file://hello.sh"

S = "${WORKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello.sh ${D}${bindir}/hello
}
