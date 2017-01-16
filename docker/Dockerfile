FROM ubuntu

RUN apt-get update && \
    apt-get install -y --no-install-recommends curl xvfb firefox openjdk-8-jdk-headless zip unzip wget fonts-ipafont && \
    (curl https://dl-ssl.google.com/linux/linux_signing_key.pub | apt-key add -) && \
    echo "deb http://dl.google.com/linux/chrome/deb/ stable main" >> /etc/apt/sources.list.d/google.list && \
    apt-get update && \
    apt-get install -y --no-install-recommends google-chrome-stable && \
    cd /opt && wget https://github.com/mozilla/geckodriver/releases/download/v0.13.0/geckodriver-v0.13.0-linux64.tar.gz && \
    tar zxvf geckodriver-v0.13.0-linux64.tar.gz && \
    rm geckodriver-v0.13.0-linux64.tar.gz && \
    wget https://chromedriver.storage.googleapis.com/2.27/chromedriver_linux64.zip && \
    unzip chromedriver_linux64.zip && \
    rm chromedriver_linux64.zip && \
    rm -rf /var/lib/apt/lists/*
    
