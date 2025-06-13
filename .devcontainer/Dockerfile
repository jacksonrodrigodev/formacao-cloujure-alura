FROM ubuntu:22.04

RUN apt-get update && apt-get install -y \
    curl \
    git \
    default-jdk \
    rlwrap \
    unzip \
    locales \
    && apt-get clean

RUN locale-gen en_US.UTF-8
ENV LANG=en_US.UTF-8
ENV LANGUAGE=en_US:en
ENV LC_ALL=en_US.UTF-8

RUN curl -O https://download.clojure.org/install/linux-install-1.11.1.1413.sh && \
    chmod +x linux-install-1.11.1.1413.sh && \
    ./linux-install-1.11.1.1413.sh && \
    rm linux-install-1.11.1.1413.sh

WORKDIR /workspace
