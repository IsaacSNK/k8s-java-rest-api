FROM websphere-liberty

ENV BUILD_DIR build/libs/

COPY --chown=1001:0 $BUILD_DIR /config/dropins/
