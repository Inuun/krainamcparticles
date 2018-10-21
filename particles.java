double helixRadius = 1;
            double helixUpStep = 0.1;
            double helixHeight = 3;

            double calcRadius = helixRadius;
            for (double y = 0; y <= helixHeight; y += helixUpStep) {

                double x = calcRadius * Math.cos(y * 2.1);
                double z = calcRadius * Math.sin(y * 2.1);

                if (y > 2.5) {
                    calcRadius *= 0.60;
                } else if (y > 2) {
                    calcRadius *= 0.85;
                } else if (y > 1.5) {
                    calcRadius *= 0.95;
                } else {
                    calcRadius *= 0.97;
                }

                FLAME.send(viewers, (location.getX() + x), (location.getY() + y), (location.getZ() + z), 0, 0, 0, 0, 1);
            }

            calcRadius = helixRadius * -1;
            for (double y = 0; y <= helixHeight; y += helixUpStep) {

                double x = calcRadius * Math.cos(y * 2.1);
                double z = calcRadius * Math.sin(y * 2.1);

                if (y > 2.5) {
                    calcRadius *= 0.60;
                } else if (y > 2) {
                    calcRadius *= 0.85;
                } else if (y > 1.5) {
                    calcRadius *= 0.95;
                } else {
                    calcRadius *= 0.97;
                }

                FLAME.send(viewers, (location.getX() + x), (location.getY() + y), (location.getZ() + z), 0, 0, 0, 0, 1);
            }
